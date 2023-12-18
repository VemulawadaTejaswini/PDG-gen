import java.util.*;

class Main {
    private static Scanner scan = new Scanner(System.in);

    public static void out(int num) {
        System.out.println(num);
    }

    public static void main(String[] args) {

        int n = scan.nextInt();
        String str = scan.next();
        int min = n;

        for (int i = 0; i < n; i++) {
            String cut1 = str.substring(0, i);
            String cut2 = str.substring(i+1);

            ArrayList<String> has1 = new ArrayList<String>();
            for (int j = 0; j < cut1.length(); j++) {
                has1.add((String.valueOf(cut1.charAt(j))));
            }
            Collections.sort(has1);

            ArrayList<String> has2 = new ArrayList<String>();
            for (int j = 0; j < cut2.length(); j++) {
                has2.add((String.valueOf(cut2.charAt(j))));
            }
            Collections.sort(has2);

//            System.out.println(Arrays.toString(has1.toArray()));
//            System.out.println(Arrays.toString(has2.toArray()));

            //has1 is all 'E'
            //has2 is all 'W'
            int ind1 = ((has1.size() - has1.indexOf("W"));
            int ind2 = has2.indexOf("W");

            if(ind1 > has1.size()){ind1 = 0;}
            if(ind2 == (-1)){ind2 = 0;}
            int temp = ind1+ind2;
            if(min > temp){
            min = temp;
        }

        }
        out(min);
    }
}