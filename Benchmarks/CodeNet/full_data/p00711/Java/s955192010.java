import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      while(true){
      int N = sc.nextInt();
      int M = sc.nextInt(); sc.nextLine(); //nextIntの後残る改行文字を消す
      if(N==0&&M==0){break;}
      int count=0;
      String[] line = new String[M];
      for(int i=0;i<M;i++){
      	line[i]=sc.nextLine();
      } 
      String[][] a = new String[N][M];
      for(int j=0;j<M;j++){
       for(int k=0;k<N;k++){
        a[k][j]=String.valueOf(line[j].charAt(k));
       }
      }
      for(int t=0;t<60;t++){
       for(int p=0;p<M;p++){
        for(int q=0;q<N;q++){
         if((a[q][p].equals("@"))&&(a[Math.max(0,q-1)][p].equals("."))){
         	a[Math.max(0,q-1)][p]="@";
         }
         if((a[q][p].equals("@"))&&(a[q][Math.max(0,p-1)].equals("."))){
         	a[q][Math.max(0,p-1)]="@";
         }
         if((a[q][p].equals("@"))&&(a[Math.min(N-1,q+1)][p].equals("."))){
         	a[Math.min(N-1,q+1)][p]="@";
         }
         if((a[q][p].equals("@"))&&(a[q][Math.min(M-1,p+1)].equals("."))){
         	a[q][Math.min(M-1,p+1)]="@";
         }
        }
       }
      }
      for(int r=0;r<M;r++){
       for(int s=0;s<N;s++){
         if(a[s][r].equals("@")){
         	count++;
         }
       }
      }
     System.out.println(count);
      }
   }
}
