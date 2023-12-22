import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] S = new int[n];
        int opt = 0;
        for(int i=0;i<n;i++) S[i] = sc.nextInt();
        opt = mergesort(S,opt,0,n);
        for(int i=0;i<n;i++){
            System.out.print(S[i]);
            if(i!=n-1) System.out.print(" ");
        }
        System.out.println();
        System.out.println(opt);
    }
    public static int  mergesort(int [] S,int sum,int left,int right){
        if(left+1<right){
            int mid = (left+right)/2;
            sum=mergesort(S,sum,left,mid);
            sum=mergesort(S,sum,mid,right);
            sum=merge(S,left,right,mid,sum);
        }
        return sum;
    }
    public static int merge(int [] S,int left,int right,int mid,int sum){
        int n1 = mid-left;
        int n2 = right-mid;
        int L[] = new int[n1+1];
        int R[] = new int[n2+1];
        for(int i=0;i<n1;i++)L[i] = S[left+i];
        for(int i=0;i<n2;i++)R[i] = S[mid+i];
        L[n1]=999999999;
        R[n2]=999999999;
        int i=0,j=0;
        for(int k=left;k<right;k++){
            if(L[i]<=R[j]){
                S[k] = L[i];
                i++;
                sum++;
            }
            else{
                S[k] = R[j];
                j++;
                sum++;
            }
        }
        return sum;
    }
}
