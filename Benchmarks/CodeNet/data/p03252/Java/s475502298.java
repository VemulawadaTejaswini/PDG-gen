import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String origin=sc.nextLine();
        int[] origin_count=new int[26];
        String goal=sc.nextLine();
        int[] goal_count=new int[26];
        for(int i=0;i<26;i++){
            origin_count[i]=goal_count[i]=0;
        }
        for(int i=0;i<origin.length();i++){
            origin_count[origin.charAt(i)-'a']++;
            goal_count[goal.charAt(i)-'a']++;
        }
        boolean goalisdouble=false;
        boolean originisdouble=false;
        char dob;
        for(int i=0;i<origin_count.length;i++){
            if(origin_count[i]>1){originisdouble=true; break;}
        }
        for(int i=0;i<goal_count.length;i++){
            if(goal_count[i]>1){goalisdouble=true; break;}
        }
        if(originisdouble && goalisdouble){
            int[] doubleplace=new int[origin.length()];
            for(int i=0;i<26;i++){
                if(goal_count[i]<=1) continue;
                // a-zのうち複数回出てくる文字の場合
                for(int j=0;j<goal.length();j++){
                    if(goal.charAt(j)=='a'+i){doubleplace[j]='a'-goal.charAt(j)+1;} //+1に注意
                }
            }

            //ダブったa-zに対応する位置の文字が同じかどうか
            char temp='0';
            boolean first=true;
            for(int i=1;i<27;i++){
                first=true;
                for(int j=0;j<goal.length();j++){
                    if(doubleplace[j]==i){
                        if(first) {temp=origin.charAt(j); first=false;}
                        else if(origin.charAt(j)!=temp){System.out.println("No"); return;}
                    }
                }
            }
            System.out.println("Yes");
        }
        else if((originisdouble && !(goalisdouble)) || (!(originisdouble) && goalisdouble)){
            System.out.println("No");
        }
        else
            System.out.println("Yes");
    }
}
