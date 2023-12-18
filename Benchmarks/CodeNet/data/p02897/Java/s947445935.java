import java.util.Scanner;


class Main{
 public static void main(String[] args){
  Scanner scanner = new Scanner(System.in);
  int N = scanner.nextInt();
  

 
int i = 0;
for(int a = 1;a <= N; a++){
  if(a % 2 == 1){
    i++;
  }else{
    continue;
  }
}

  System.out.println( (double)i/N );
  
  
}
}
