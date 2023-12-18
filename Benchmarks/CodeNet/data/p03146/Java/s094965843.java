import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        int s = Integer.valueOf(inputString);
        if(s==4 || s==2 || s==1 ) {
            System.out.println("4");
            return;
        }
        int lastNumber = s;
        int i = 2;
        while(true) {
            int thisNumber = function(lastNumber);
            if(thisNumber==4) {
                System.out.println(i+3);
                break;
            }
            lastNumber = thisNumber;
            i++;
        }
    }

    private static int function(int n) {
        if(n%2==0){
            return n/2;
        }else{
            return 3*n+1;
        }

    }

}