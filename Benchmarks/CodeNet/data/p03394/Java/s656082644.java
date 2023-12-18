import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        List<Integer> ans = new ArrayList<>();
        if(N==3){
            ans.add(2);ans.add(5);ans.add(63);
        }else{
            ans.add(3);ans.add(9);
            ans.add(2);ans.add(4);
            N-=4;
            int even = 10;
            int oddup = 18;
            int odddown=30000;
            while(N>0){
                if(N==1){
                    ans.add(odddown%2==0 ? odddown : odddown-3);
                    break;
                }
                if(even<30000){
                    ans.add(even);ans.add(even-2);
                    even+=6;
                }else{
                    ans.add(oddup);ans.add(odddown);
                    oddup+=3;odddown-=3;
                }
                N-=2;
            }
        }
        for(int i : ans)System.out.print(i+" ");
        System.out.println();
    }
}