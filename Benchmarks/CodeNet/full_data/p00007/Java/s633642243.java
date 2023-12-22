import java.util.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double hensai = 100000;
        for(int i=0;i<n;i++){
            hensai *= 105;
            hensai = (long)Math.ceil((double)hensai/100000);
            hensai *=1000;
        }    
        System.out.println((long)hensai);
    }
}