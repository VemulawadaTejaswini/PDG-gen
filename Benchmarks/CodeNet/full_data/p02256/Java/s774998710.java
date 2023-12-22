import java.util.Scanner;
public class Main {
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int x = input.nextInt();
int y = input.nextInt();
int out = helper(x,y);
System.out.println(out);
}

public int helper(int x, int y){
if(y == 0){
return x;
} else if(x >= y){
return helper(y, x%y);
}
}

}
