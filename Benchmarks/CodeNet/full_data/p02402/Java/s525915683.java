import java.util.Scanner;

class Main{
public static void main(String[] args){

Scanner scan = new Scanner(System.in);

int i = scan.nextInt();
int max = -1000000, min = 1000000, sum = 0;
for(int j = 0; j <i; j++){
    int x = scan.nextInt();
    sum += x;
    if(x > max) max = x;
    if(x < min) min = x;
    }


System.out.println(min +" "+ max +" "+sum);
   }
}
    