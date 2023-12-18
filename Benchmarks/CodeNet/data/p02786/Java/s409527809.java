import java.util.Scanner;
 
public class Main{
 
public static void main(String[] args) {
  
double result = 0;
int p = 0;
int count = 0;
 
Scanner scanner = new Scanner(System.in);
int H = scanner.nextInt();
  
while(H=1){
  H = H/2;
  count += 1;
}

for(int i =0; i<count; i++){
  result = result + Math.pow(2, count);
}
  
System.out.println(int(result));
  
}
}
  

  