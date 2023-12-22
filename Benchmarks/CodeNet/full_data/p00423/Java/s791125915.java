import java.util.*;

class Main{

    static List<LinkedList<Integer>> kaito;

    public static void kurikaesi(int x) {
        int[][] card = new int[x][2];


        for(int i=0; i<x; i++){
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            String[] data = line.split(" ");
            card[i][0] = Integer.parseInt(data[0]);
            card[i][1] = Integer.parseInt(data[1]);
        }


        int goukei_A = 0, goukei_B = 0;

        for(int[] item : card){
            if(item[0] > item[1]){
                goukei_A += item[0] + item[1];
            }else if(item[0] < item[1]){
                goukei_B += item[0] + item[1];
            }else{
                goukei_A += item[0];
                goukei_B += item[0];
            }

        }

        LinkedList<Integer> kari = new LinkedList<Integer>();
        kari.add(goukei_A);
        kari.add(goukei_B);

        kaito.add(kari);
        

    }

    public static void main(String[] args) {
        kaito = new LinkedList<>();

        while (true) {
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            int n = Integer.parseInt(line);

            if(n == 0){
                break;
            }else{
                kurikaesi(n);
            }

        }


        for(LinkedList<Integer> item : kaito){
            for(int it : item){
                System.out.print(it + " ");
            }
            System.out.println();
        }

    }

}