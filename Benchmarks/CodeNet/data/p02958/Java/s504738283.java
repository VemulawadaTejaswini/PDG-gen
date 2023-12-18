import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        Integer N = Integer.parseInt(scan.next());
        
        ArrayList<Integer> p1 = new ArrayList<Integer>();
        ArrayList<Integer> p2 = new ArrayList<Integer>();

        for(int i=0;i<N;i++){
            int s = Integer.parseInt(scan.next());
            p1.add(s);
            p2.add(s);
        }

        Collections.sort(p2);

        int counter = 0;
        int c = 0;
        boolean r = false;
        for(int i=0;i<N;i++){
            if(p1.get(i) != p2.get(i)){
                counter++;
                if(counter == 1){
                    c = i;
                }
                if(counter == 2){
                    int tmp = p1.get(c);
                    p1.remove(c);
                    p1.add(c,p1.get(i-1));
                    p1.remove(i);
                    p1.add(i,tmp);
                    for(int j=0;j<N;j++){
                        if(p1.get(j) != p2.get(j)) break;
                        if(j==N-1){
                            r = true;
                        }
                    }
                }

                if(counter==3) break;
            } 
        }

        
        if(counter == 3)
            System.out.println("NO");
        else{
            if(r || counter == 0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }
    }
}