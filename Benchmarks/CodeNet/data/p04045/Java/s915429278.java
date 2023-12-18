import java.util.*;


class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int alen = String.valueOf( a ).length();
        List<Integer> array = new ArrayList<Integer>();
        int i = 0;

        while(i<b){
          int c = scan.nextInt();
          array.add(c);
          i++; 
        }
        Collections.sort(array);
        i = 0;
        int ans = a;
        boolean dd = false;
        while(dd == false){
            String aa = String.valueOf( ans );
            int anslen = String.valueOf( ans ).length();
            int j = 0;
            int ddd = 0;
            while(j<anslen){
                int n = 0;
                int ansv = Integer.parseInt(aa.substring(j,j+1));
                while(n<b){
                    if(ansv == array.get(n)){
                        ddd++;
                        break;
                    }
                    n++;
                  }
                j++;
            }
            if(ddd == 0){
                dd = true;
                break;
            }else{
                ans++;
            }
        }
        System.out.println(ans);
        scan.close();
    }
}