import java.util.*;
class Main{
    public static void main(String args[]){
	Scanner cin = new Scanner(System.in);
	int a = cin.nextInt();
	int b = cin.nextInt();
	int x = a/b;
	int y = a%b;
	double z = (double)a/(double)b;
	System.out.printf("%d %d %f\n",x,y,z);
    }
}