import java.util.Scanner

public class Main{
  pubic static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int k = sc.nextInt();
  int odd = 0;
  int even =0;
  
  for(int i=1;i<=k;i++){
    if(i%2==0){
      even++;
    }else{
      odd++;  
    }
  }
  System.out.print(even*odd)
  }
}