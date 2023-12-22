import java.util.*;

class Main {

    static int toInt (ArrayList<Integer> data) {
        int result = 0;
        int mult = 1;
        
        for (int i = 7; i >= 0; i--) {
            result += data.get(i) * mult;
            mult *= 10;
        }
        return result;
    }

    static void solve (ArrayList<Integer> data) {
        int max, min;

        Collections.sort(data);
        min = toInt(data);
        Collections.reverse(data);
        max = toInt(data);

        System.out.println(max - min);
    }

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        sc.nextLine();

        while (sc.hasNext()) {
            String line = sc.nextLine();
            ArrayList<Integer> data = new ArrayList<Integer>();

            for(int i = 0; i < 8; i++) {
                data.add(Integer.parseInt(line.substring(i,i+1)));
            }

            solve(data);
        }
            
                
    }
}