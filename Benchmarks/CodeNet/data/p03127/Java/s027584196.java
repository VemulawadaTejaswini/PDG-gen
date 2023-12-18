import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        ArrayList<Integer> List = new ArrayList<>();
        int min = 1000000000;
        int max = 1;
        int gusu =0;
        for(int a=0;a<N;a++){
            int input = sc.nextInt();
            List.add(input);
            if(input%2==0)gusu++;
        }
        if(gusu==N) System.out.println(Collections.min(List));
        else{
            int max2=Collections.max(List);
            for(int a=0;a<N;a++) {
                if (List.get(a) % 2 != 0) {
                    int num = max2 % List.get(a);
                    if (num < min && num != 0) {
                        min = num;
                    }
                    if (num > max && num != 0) {
                        num = Math.abs(num - List.get(a));
                        max = num;
                    }
                }
            }
            if(max>min) System.out.println(min);
            else System.out.println(max);
            }
        }
    }
