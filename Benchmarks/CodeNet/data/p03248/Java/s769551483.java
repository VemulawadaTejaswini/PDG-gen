import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        int l = s.length() / 2;
        int[] is = new int[l];
        if(s.charAt(0) == '0' || s.charAt(s.length()-1) == '1'){
            System.out.println("-1");
            return;
        }
        for(int i=0; i<l; i++){
            if(s.charAt(i) != s.charAt(s.length() - 2 - i)){
                System.out.println("-1");
                return;
            }
            is[i] = s.charAt(i) == '0' ? 0 : 1;
        }

        ArrayList<Integer[]> data = new ArrayList<Integer[]>();
        int min = Integer.MAX_VALUE;
        int cont = 1;
        int pos = 1;
        for(int i=1; i<l; i++){
            if(is[i] == 0){
                if(cont > 0){
                    data.add(new Integer[] {pos, cont});
                    if(cont < min) min = cont;
                    cont = 0;
                }
            }else{
                if(cont > 0){
                    cont++;
                }else{
                    cont++;
                    pos = i+1;
                }
            }
        }
        if(cont > 0){
            data.add(new Integer[] {pos, cont});
            if(cont < min) min = cont;
        }

        // if(min == 1){
        //     System.out.println("-1");
        //     return;
        // }

        int mn = s.length();
        mn -= data.get(0)[1];
        for(int i=1; i<data.size(); i++){
            int mpos = data.get(i)[0];
            int mcont = data.get(i)[1];
            mn -= mpos;
            int mnum = (mcont-1)/min;
            for(int j=0; j<mnum-1; j++){
                mn -= mpos + min * (j+1);
            }
            if(mnum > 0 && mcont % min != 0){
                mn -= mpos+mcont-min;
            }
        }
        if(mn < 0){
            System.out.println("-1");
            return;
        }


        mn = s.length();
        mn -= data.get(0)[1];
        int mc = 2;
        for(int i=0; i<min; i++){
            System.out.println(mc-1 + " " + mc);
            mc++;
        }
        if(data.get(0)[1] > min){
            int mcont = data.get(0)[1];
            int mnum = (mcont-1)/min;
            int mpos = 1;
            for(int j=0; j<mnum-1; j++){
                mn -= mpos + min * (j+1);
                int mmc = mc;
                System.out.println("1 " + mmc);
                mc++;
                for(int k=0; k<min-1; k++){
                    System.out.println(mmc + " " + mc);
                    mc++;
                }
            }
            if(mnum > 0 && mcont % min != 0){
                mn -= mpos+mcont-min;
                int mmc = mc;
                System.out.println("1 " + mmc);
                mc++;
                for(int k=0; k<min-1; k++){
                    System.out.println(mmc + " " + mc);
                    mc++;
                }
            }
        }
        for(int i=1; i<data.size(); i++){
            int mpos = data.get(i)[0];
            int mcont = data.get(i)[1];
            mn -= mpos;
            for(int j=0; j<mcont; j++){
                int mmc = mc;
                System.out.println("1 " + mmc);
                mc++;
                for(int k=0; k<min-1; k++){
                    System.out.println(mmc + " " + mc);
                    mc++;
                }
            }
            int mnum = (mcont-1)/min;
            for(int j=0; j<mnum-1; j++){
                mn -= mpos + min * (j+1);
                int mmc = mc;
                System.out.println("1 " + mmc);
                mc++;
                for(int k=0; k<min-1; k++){
                    System.out.println(mmc + " " + mc);
                    mc++;
                }
            }
            if(mnum > 0 && mcont % min != 0){
                mn -= mpos+mcont-min;
                int mmc = mc;
                System.out.println("1 " + mmc);
                mc++;
                for(int k=0; k<min-1; k++){
                    System.out.println(mmc + " " + mc);
                    mc++;
                }
            }
        }

        while(mc <= s.length()){
            System.out.println("1 " + mc);
            mc++;
        }
    }
}