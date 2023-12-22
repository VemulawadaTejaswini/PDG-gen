import java.util.Scanner;

public class Main{
    
    static int[][] p;
    //static int h;
    //static int score;
    //static boolean end;
    
    static int check(int h, int score) {
        for(int i = 1; i <= 9; i++) {
            String c = String.valueOf(i);
            String s5 = c + c + c + c + c;
            String s4 = c + c + c + c;
            String s3 = c + c + c;
            for(int j = 0; j < h; j++) {
                String t = "";
                for(int k = 0; k < 5; k++) {
                    t += String.valueOf(p[j][k]);
                }
                if(t.indexOf(s5) != -1) {
                    score += i * 5;
                    p[j][0] = p[j][1] = p[j][1] = p[j][3] = p[j][4] = 0;
                }else if(t.indexOf(s4) != -1) {
                    score += i * 4;
                    int in = t.indexOf(s4);
                    p[j][in] = p[j][in+1] = p[j][in+2] = p[j][in+3] = 0;
                }else if(t.indexOf(s3) != -1) {
                    score += i * 3;
                    int in = t.indexOf(s3);
                    p[j][in] = p[j][in+1] = p[j][in+2] = 0;
                }
            }
        }
//        for(int i = 0; i < h; i++) {
//            for(int j = 0; j < 5; j++) {
//                System.out.print(p[i][j] + " ");
//            }
//            System.out.println();
//        }
        return score;
    }
    
    static void down(int h) {
        for(int j = 0; j < 5; j++) {
        	String s = "";
        	for(int i = 0; i < h; i++) {
        		s += String.valueOf(p[i][j]);
        		p[i][j] = 0;
        	}
        	s = s.replaceAll("0", "");
        	for(int i = 0; i < s.length(); i++) {
        		p[i][j] = Integer.parseInt(s.substring(i, i+1));
        	}
        }
    }
    
//    static void swap(int a, int b) {
//        int temp = a;
//        a = b;
//        b = temp;
//    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            int h = sc.nextInt();
            if(h == 0) break;
            p = new int[h][5];
            for(int i = h-1; i >= 0; i--) {
                for(int j = 0; j < 5; j++) {
                    p[i][j] = sc.nextInt();
                }
            }
            
            int score = 0;

            while(true) {
                int oldscore = score;
                score = check(h, score);
                //System.out.println(score);
                if(score == oldscore) {
                    System.out.println(score);
                    break;
                }
                down(h);
//                for(int i = 0; i < h; i++) {
//                    for(int j = 0; j < 5; j++) {
//                        System.out.print(p[i][j] + " ");
//                    }
//                    System.out.println();
//                }
            }
        }        
    }
}
