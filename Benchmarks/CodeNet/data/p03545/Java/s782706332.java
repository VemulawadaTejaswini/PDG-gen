import java.util.*;
class Main{
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	int d = x%10;
	int c = x/10%10;
	int b = x/10/10%10;
	int a = x/10/10/10%10;
	for(int i = 0; i<8; i++) {
	    int number = i;
	    int cnt = 0;
	    int[] abcd = {a,b,c,d};
	    char[] symbol = {0,0,0};
	    while(cnt < 3) {
		symbol[cnt] = (number%2==0) ? '+': '-';
		number = number/2;
		cnt++;
	    }
	    int result = abcd[0];
	    for(int j = 0; j<3; j++) {
		if(symbol[j]=='+') {
		    result += abcd[j+1];
		}else{
		    result -= abcd[j+1];
		}
	    }
	    if(result == 7) {
		System.out.println(a+""+symbol[0] +""+b+""+ symbol[1] +""+c+""+ symbol[2] +""+d+"=7");
		return;
	    }

	}
    }
}