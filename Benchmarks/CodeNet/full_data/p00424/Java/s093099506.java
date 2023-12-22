import java.util.*;
public class Main {
   public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   char[][] ch=new char[n][2];
	   for(int i=0;i<n;i++){
		   ch[i][0]=sc.next().charAt(0);
		   ch[i][1]=sc.next().charAt(0);
	   }
	   int m=sc.nextInt();
	   char c;
	   for(int i=0;i<m;i++){
		   c=sc.next().charAt(0);
		   for(int j=0;j<n;j++){
			   if(c==ch[j][0]){
				   System.out.println(ch[j][1]);
				   break;
			   }else if(c==n-1){
				   System.out.println(c);
			   }
		   }
	   }
   }
}
