import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
public class Main {
	public static int partition(card[] A, int p, int r){
        final int x = A[r].num;
         
        int i = p - 1;
        for(int j = p; j < r; j++){
            if(A[j].num <= x){
                i++;
                 
                card tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }
        }
         
        card tmp = A[i + 1];
        A[i + 1] = A[r];
        A[r] = tmp;
         
        return i + 1;
    }
     
    public static void quicksort(card[] A, int p, int r){
        if(p < r){
            final int q = partition(A, p, r);
            quicksort(A, p, q - 1);
            quicksort(A, q + 1, r);
        }
    }
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=new PrintWriter(System.out);
		int n=Integer.parseInt(br.readLine());
		card a[]=new card[n];
		for (int i=0;i<n;i++){
			String[] str=br.readLine().split(" ");
			a[i]=new card(str[0],Integer.parseInt(str[1]),i);
		}
		quicksort(a,0,n-1);
		String message="Stable";
		for (int i=0;i<n-1;i++){
			if(a[i].num==a[i+1].num && a[i].index>a[i+1].index){
				message="Not stable";
				break;
			}
		}
		pw.println(message);
		for (int i=0;i<n;i++){pw.println(a[i].suit+" "+a[i].num);};
		pw.close();
	}
}
class card{
	String suit;
	int num,index;
	public card(String s,int n,int i){
		this.suit=s;
		this.num=n;
		this.index=i;
	}
}