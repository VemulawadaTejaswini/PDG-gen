import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    int score1[] = new int[100];
    int i =0, max=0, min, sum=0 ;
try(Scanner sc =new Scanner(System.in)){
    while(true){
 int score = sc.nextInt();
 if(score==0) { break; }
 score1[i]=score;
 sum=sum+score1[i];
 i++;
    }
   
}
max=score1[0];
    min=score1[0];
    for(int j=0;j<i;j++){
        if(max>score1[j]){
            if(min>score1[j]) min=score1[j];       
        }else max=score1[j];
    }
sum=sum-max-min;
if(i>2) System.out.println(sum/(i-2));
  }
}
