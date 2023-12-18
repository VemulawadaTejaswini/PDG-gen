import java.util.*;
class Main{
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N =	sc.nextInt();
	int cnt	= 0;
	while(N!=0){
            if(N%2==0) cnt++;
            N /= 10;
        }
    }
}