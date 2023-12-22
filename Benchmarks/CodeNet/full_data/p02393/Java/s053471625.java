import java.util.Scanner;
import java.util.InputMismatchException;
class Main{
public static void main(String args[]){

    Scanner scan = new Scanner(System.in);
    try{
int a = scan.nextInt();
int b = scan.nextInt();
int c = scan.nextInt();
int temp;

int i=0;
for(i=0;i<3;i++){
if(a>b){

    temp=a;
    a=b;
    b=temp;
    
}

if(b>c){

    temp=b;
    b=c;
    c=temp;
    
}



if(a>c){

    temp=a;
    a=c;
    c=temp;
    
}

}



System.out.println(a+ " " +b+ " " +c);



}catch (InputMismatchException e) {
        	System.out.println("try again!!");
        }





}
}

