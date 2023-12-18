import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        for(int i = 357; i<n; i++) {
            int	num = i;
            int x;
	    int n7 = 0;
	    int n5 = 0;
            int n3 = 0;
            while(num != 0) {
		x = num%10;
		if(x != 7 && x != 5 && x != 3) {
		    break;
                }else if(x == 7){
                    n7++;
                }else if(x == 5){
                    n5++;
                }else if(x == 3){
                    n3++;
		}
                num = num/10;
	    }
            if(num == 0 && n7 > 0 && n5 > 0 && n3 > 0) cnt++;
        }
        System.out.println(cnt);
    }
}