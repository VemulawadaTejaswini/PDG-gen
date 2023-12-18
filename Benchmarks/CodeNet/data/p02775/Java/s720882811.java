import java.util.*;


class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String N = sc.next();
        int mai = 0;
        int kuriagari = 0;
        for(int i=N.length()-1; i>=0; i--){
            int p = Character.getNumericValue(N.charAt(i));
            if(kuriagari == 1) {
                //p += 1;
                kuriagari = 0;
                if(p == 10){
                    kuriagari = 1;
                    continue;
                }
            }
            if(p>5) {
                mai += 10-p;
                kuriagari = 1;
            } else {
                mai += p;
            }
        }
        if(kuriagari == 1){
            mai++;
        }
        System.out.println(mai);
    }
}