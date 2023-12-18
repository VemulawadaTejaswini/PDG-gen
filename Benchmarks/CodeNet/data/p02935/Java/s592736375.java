import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int[] v = new int[n];
        ArrayList<Double> list = new ArrayList<Double>(); 
        for(int i = 0;i<v.length;i++) {
            v[i] = stdIn.nextInt();
            list.add((double)v[i]);
        }
        double a = 0;
        Collections.sort(list);
        //ArrayList<Double> list = new ArrayList<Double>();        
        while(list.size()!=1) {
            double b = list.get(0);
            double c = list.get(1);
            list.remove(0);
            list.remove(0);
            double d = (b+c)/2;
            //System.out.println(d);
            list.add(d);
            Collections.sort(list);
        }
        System.out.println(list.get(0));
        }
    }