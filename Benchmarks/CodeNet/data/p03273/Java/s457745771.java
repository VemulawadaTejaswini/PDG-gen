import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H =sc.nextInt();
        int W = sc.nextInt();
        HashSet<Integer> delRow = new HashSet<>();
        HashSet<Integer> delCol = new HashSet<>();

        StringBuilder sb1 = new StringBuilder();
        for(int i=0;i<W;i++) sb1.append(".");
        String stdRow = sb1.toString();
        StringBuilder sb2 = new StringBuilder();
        for(int i=0;i<H;i++) sb2.append(".");
        String stdCol = sb2.toString();

        String[] dic = new String[H];
        for(int i=0;i<H;i++) {
            dic[i]=sc.next();
            if(dic[i].equals(stdRow)) delRow.add(i);
        }
        for(int col=0;col<W;col++){
            StringBuilder cur = new StringBuilder();
            for(int i=0;i<H;i++) cur.append(dic[i].charAt(col));
            if(stdCol.equals(cur.toString())) delCol.add(col);
        }
        for(int row=0;row<H;row++){
            if(delRow.contains(row)) continue;
            StringBuilder temp = new StringBuilder();
            for(int col=0;col<W;col++){
                if(delCol.contains(col)) continue;
                temp.append(dic[row].charAt(col));
            }
            System.out.println(temp.toString());
        }
    }
}
