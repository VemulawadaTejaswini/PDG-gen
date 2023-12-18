import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int ld=0;
        int tmp=0, min = n/2;
        sc.close();
        for(int k=0; k<s.length(); k++) {
            for(int i=0; i<s.length(); i++) {
                if(k < i) {
                    if(s.charAt(i)=='E') tmp++;
                }else if(k > i) {
                    if(s.charAt(i)=='W') tmp++;
                }
                if(i==s.length()-1 && tmp<min) {
                    min = tmp; 
                }
            }
            tmp=0;
        }
        System.out.println(min);
    }
}
