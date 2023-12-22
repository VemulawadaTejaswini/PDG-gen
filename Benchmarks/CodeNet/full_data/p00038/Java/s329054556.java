import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        label:while(sc.hasNext()){
            String str = sc.next();
            String[] s = str.split(",");
            int[] a = new int[5];
            for(int i = 0; i < 5;i++){
                a[i]=Integer.parseInt(s[i]);
            }
            Arrays.sort(a);
            if(a[0]==a[1]&&a[1]==a[2]&&a[2]==a[3]){
                System.out.println("four card");
                continue;
            }
            if(a[1]==a[2]&&a[3]==a[2]&&a[4]==a[3]){
                System.out.println("four card");
                continue;
            }
            if(a[0]==a[1]&&a[0]==a[2] && a[3]==a[4]){
                System.out.println("full house");
                continue;
            }
            if(a[0]==a[1] && a[2]==a[3] && a[2] == a[4]){
                System.out.println("hull house");
                continue;
            }
            if(a[0]+1==a[1]&&a[0]+2==a[2]&&a[0]+3==a[3]&&a[0]+4==a[4]){
                System.out.println("straight");
                continue;
            }
            if(a[0]==1&&a[1]==10&&a[2]==11&&a[3]==12&&a[4]==13){
                System.out.println("straight");
                continue;
            }
            if(a[0]==a[1] && a[0]==a[2] || a[1]==a[2]&&a[1]==a[3] || 
                    a[2]==a[3] && a[2] == a[4]){
                System.out.println("three card");
                continue;
            }
            for(int i = 0; i < 3;i++){
                if(a[i]==a[i+1]){
                    for(int j = i+3; j < 5;j++){
                        if(a[j]==a[j-1]){
                            System.out.println("two pair");
                            continue label;
                        }
                    }
                }
            }
            for(int i = 0; i < 4; i++){
                if(a[i]==a[i+1]){
                    System.out.println("one pair");
                    continue label;
                }
            }
            System.out.println("null");
                 
        }
    }
 
}