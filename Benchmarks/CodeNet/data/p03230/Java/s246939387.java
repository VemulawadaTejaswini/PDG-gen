import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean x = false;
        for(int i=1; i<n; i++){
            int j = (i-1)*i;
            if(j == 2n){
                x = true;
            }
        }
        if(x){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}