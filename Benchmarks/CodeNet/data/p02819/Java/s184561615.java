import java.util.Scanner;
class Main{
public static void main(String args[]){

Scanner scanner= new Scanner(System.in);

long X=scanner.nextLong();

long i=0;
long l=X+i;
while(l%2==0){
i++;
}
System.out.println(l);
}
}
