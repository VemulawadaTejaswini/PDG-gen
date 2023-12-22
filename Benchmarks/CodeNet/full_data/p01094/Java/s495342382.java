import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
        int n = scanner.nextInt();
        if(n == 0){
            System.exit(0);
        }
        int[] cand = new int[26];
        boolean flag = false;
        char a = 'A';
        int no1 = 0;
        int no2 = 0;
        int num = 0;
        int no1num = 0;
        int no2num = 0;
        for(int i = 0;i < n;i++){
            String vote1 = scanner.next();
            char[] vote2 = vote1.toCharArray();
            char vote = vote2[0];
            for(int j = 0;j<26;j++){
                if(a+j == vote){
                    no1num = cand[no1];
                    no2num = cand[no2];
                    cand[j]++;
                    if(cand[j]>no1num){
                        if(j == no2){
                            no2 = no1;
                            no1 = j;
                        }else{
                        no1 = j;
                        }
                    }else if(cand[j]>no2num){
                        no2 = j;
                    }
                    if(cand[no1]-cand[no2]>n-i-1){
                        flag = true;
                        num = i+1;
                        break;
                    }
                    break;
                }
            }
            if(flag == true){
                break;
            }
        }
        if(n == 1){
            System.out.println((char)(a+no1)+" "+n);
        }
        else if(cand[no1] == cand[no2]){
            System.out.println("TIE");
        }else{
            System.out.println((char)(a+no1)+" "+num);
        }
        String gomi = scanner.nextLine();
    }
    }
}
