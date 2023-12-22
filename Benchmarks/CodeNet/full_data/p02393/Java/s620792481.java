import java.util.*;

public class Main{
    public static void main(String[] args){
        Main par = new Main();
        Main2 chi = par.new Main2();
        chi.sort();
        System.out.println();
    }

    Scanner scan = new Scanner(System.in);

    private class Main2{
        void sort(){
            List<Integer> list =  new ArrayList<Integer>();
            for(int i=0; i < 3; i++){
                list.add(scan.nextInt());
            }
            Collections.sort(list);
            for(int i=0; i < 3; i++){
                System.out.print(list.get(i)+ " ");
            }
            System.out.println();
        }
    }
}


            




