import java.util.Scanner;
public class Main{
public static void main(String[] args){

Scanner sc = newScanner(System.in);
int n = sc.nextInt();
int i= 1;

do {
  int x=i;
  if(x%10 == 3){
    System.out.print(" " + i);
    break;
  }

while(true){
x/=10;
if(x != 0)continue;
else break;
}

END_CHECK_NUM:

}
while (++i<=n);
System.out.println();

}
}