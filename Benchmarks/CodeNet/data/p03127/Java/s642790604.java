import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        ArrayList<Integer> List = new ArrayList<>();
        for(int a=0;a<N;a++){
            int input = sc.nextInt();
            List.add(input);
        }
            while(true){
                int min = Collections.min(List);
                int num = List.indexOf(min);
                for(int a=0;a<List.size();a++){
                    if(a!=num){
                        int amari = List.get(a)%min;
                        if(amari ==0) List.remove(a);
                        else List.set(a,amari);
                    }
                }
                if(List.size()==1)break;
            }
            System.out.println(List.get(0));
        }
    }
