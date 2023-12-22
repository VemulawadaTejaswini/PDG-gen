import java.util.Scanner;
public class Main{
    public static boolean equal(Data d1[], Data d2[]){
    	for(int i = 0 ; i < d1.length ; i++){
    		if(!(d1[i].data.equals(d2[i].data)))
			return false;
	}
	return true;
    }
    public static void Merge(Data d[], int left, int mid, int right){
        int n1 = mid- left;
        int n2 = right - mid;
        Data L1[] = new Data[n1 + 1];
        Data L2[] = new Data[n2 + 1];
        for(int i = 0 ; i < n1 ; i++)
            L1[i] = new Data(d[left + i].data,d[left + i].num);
        for(int i = 0 ; i < n2 ; i++)
            L2[i] = new Data(d[mid + i].data,d[mid + i].num);
        L1[n1] = L2[n2] = new Data("",1000000001) ;
        int i = 0;
        int j = 0;
        for(int k = left ; k < right ; k++){
            if(L1[i].num <= L2[j].num){
                d[k].num = L1[i].num;
		d[k].data = L1[i].data;
                i++;
            }
            else{
                d[k].num = L2[j].num;
                d[k].data = L2[j].data;
		j++;
            }
        }
    }
    public static void MergeSort(Data d[], int left, int right){
        if(left+1 < right){
            int mid = (left + right)/2;
            MergeSort(d,left,mid);
            MergeSort(d,mid,right);
            Merge(d,left,mid,right);
        }
    }
    public static int partition(Data d[], int start, int end){
        long x = d[end].num;
        int i = start-1;
        for(int j = start ; j < end ; j++){
            if(d[j].num <= x){
                i++;
                Data tmp = new Data(d[j].data,d[j].num);
		d[j].data = d[i].data;
		d[j].num = d[i].num;
		d[i].data = tmp.data;
		d[i].num = tmp.num;
            }
        }
        Data tmp2 = new Data(d[end].data,d[end].num);
	d[end].data = d[i+1].data;
	d[end].num = d[i+1].num;
	d[i+1].data = tmp2.data;
	d[i+1].num = tmp2.num;
        return i+1;
    }
    public static void quicksort(Data d[], int start, int end){
        if(start < end){
            int q = partition(d,start,end);
            quicksort(d,start,q-1);
            quicksort(d,q+1,end);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	Data d1[] = new Data[n];
	Data d2[] = new Data[n];
	for(int i = 0 ; i < n ; i++){
		String data = sc.next();
		long num = sc.nextLong();
		d1[i] = new Data(data,num);
		d2[i] = new Data(data,num);
	}
	MergeSort(d1,0,n);
	quicksort(d2,0,n-1);
	if(equal(d1,d2))
		System.out.println("Stable");
	else
		System.out.println("Not stable");
	for(int i = 0 ; i < n ; i++)
		System.out.println(d2[i].data + " " + d2[i].num);
    }
}
class Data{
	String data;
	long num;
	Data(String data, long num){
		this.data = data;
		this.num = num;
	}
}
