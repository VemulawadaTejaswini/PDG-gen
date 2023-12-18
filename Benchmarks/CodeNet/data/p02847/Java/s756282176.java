import java.util.Scanner;
class Main {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] day = {"SAT","FRI","THU","WED","TUE","MON","SUN"};
        String a = sc.next();
        for(int i=0; i<7; i++) {
        		if(a.equals(day[i])) System.out.println(i+1);
        }
        
    }
}