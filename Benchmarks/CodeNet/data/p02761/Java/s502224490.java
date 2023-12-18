import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int kekka=-1;
      int hantei=0;
      int n=sc.nextInt();
      int m=sc.nextInt();
      int[] a=new int[n];
      for(int i=0;i<n;i++){
        a[i]=-1;
      }
      for(int i=0;i<m;i++){
        int k=sc.nextInt();
        int num=sc.nextInt();
        if(a[k]==num||a[k]==-1){
          a[k]=num;
        }else{
          hantei=1;
          break;
        }
      }
      kekka=0;
      for(int i=0;i<n;i++){
        if(a[n-i-1]>0){
        kekka+=a[n-i-1]*int(Math.pow(10,n-1-i));
        }
      }
      if(hantei==0){
        System.out.println(kekka);
      }else{
        System.out.println(-1);
      }
	}
}
