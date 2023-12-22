import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] a=new int[n];
      for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
      }
      int count=0;
      int xcount=0;
       for(int j=0;j<n;j++){
        for(int k=0;k<n;k++){
        if((a[j]%a[k])==0&&j!=k)
          count+=1;;
        }
         if(count==0)
           xcount+=1;
       }
      System.out.println(xcount);
    }
}
