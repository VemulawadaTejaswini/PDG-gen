import java.util.Scanner;
 public class Main{
  public static void main(String[] args){
  Scanner sc =new Scanner(System.in);
  int[][] square =new int[20][20];
  int[][] flag =new int[20][20];
  int h,w,goal_h=0,goal_w=0,set_n=0;
  int[] count =new int[100];
  for(int i=0;i<20;i++){
   for(int j=0;j<20;j++){
     square[i][j]=0;
   }
 }
  for(int k=0;k<100;k++){
   count[k]=0;
  }
  do{
    w=sc.nextInt();
    h=sc.nextInt();
   for(int i=0;i<h;i++){
    for(int j=0;j<w;j++){
     square[i][j]=sc.nextInt();
      if(square[i][j]==3){
       goal_h=i;
       goal_w=j;
       }
    }
   }
   while(count[set_n]<10){
    for(int a=0;a<h;a++){
     for(int b=0;b<w;b++){
       if(square[a][b]==2){
         for(int c=0;c<h;c++){
           for(int d=0;d<h;d++){
             if(Math.abs(a-c)>1&&Math.abs(b-d)>1&&square[c][d]!=0){
               flag[c][d]=2;
             }
           }
         }
       }
     }
   }
   for(int c=0;c<h;c++){
     for(int d=0;d<h;d++){
         if(flag[c][d]==2)
          square[c][d]=2;
       }
     }
     count[set_n]++;
     if(count[set_n]==10&&square[goal_h][goal_w]==3)
     count[set_n]=-1;
     if(square[goal_h][goal_w]==2)
     break;
   }
   set_n++;
  }while(w!=0||h!=0);
  for(int i=0;i<set_n;i++){
    System.out.println(count[i]);
  }
  }
 }