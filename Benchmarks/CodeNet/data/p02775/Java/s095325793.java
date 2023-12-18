import java.util.*;


class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String N = sc.next();
        int mai = 0;
        int kuriagari = 0;
        for(int i=N.length()-1; i>=0; i--){
            int p = N.charAt(i);
            if(kuriagari == 1) {
                p += 1;
                kuriagari = 0;
            }
            if(p>5) {
                mai += 10-5;
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