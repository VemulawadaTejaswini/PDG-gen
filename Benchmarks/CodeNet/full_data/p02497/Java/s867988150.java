import java.util.Scanner;

public class Maini{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);

while(true){
int m = sc.nextInt();
int f = sc.nextInt();
int r = sc.nextInt();

if(m == -1 && f == -1 && r == -1){
    break;
}

if(m + f >= 80){
System.out.println("A");
}

if(m + f >= 65 && m + f < 80){
System.out.println("B");
}

if(m + f >= 50 && m + f < 65){
System.out.println("C");
}

if(m + f >= 30 && m + f < 50 && r < 50 &&  m != -1 &&  f != -1){
System.out.println("D");
}


if(m + f >= 30 && m + f < 50 && r >= 50){
System.out.println("C");
}

if(m + f < 30 && m != -1 &&  f != -1){
System.out.println("F");
}

if(m == -1){
System.out.println("F");
}

if(f == -1){
System.out.println("F");
}


}
}
}