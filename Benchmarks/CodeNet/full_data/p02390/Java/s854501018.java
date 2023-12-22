import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int h, m, s;

//        for(int i=1; i < 2000; i++) {
//            s = n - 60;
//            if(s < 60) break;
//        }
        
//        int s_left = n - s;
//        int m_left = s_left/60;
        
//        for(int j=1; j < 2000; j++) {
//            m = m_left - 60;
//            if (m < 60) break;
//        }

//        h = (m_left - m)/60;

        h = n/3600;
        m = (n-h*36000)/60;
        s = n - (h*3600 + m*60);

        System.out.println(h+":"+m+":"+s);
    }
}