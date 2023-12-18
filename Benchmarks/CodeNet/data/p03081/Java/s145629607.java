import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        String c = sc.next();
        String[] strArray = new String[a];
        int[] golem = new int[a];
        String[] spell = new String[b * 2];

        int ans = 0;

        for(int i = 0; i < a ; i++){
            strArray[i] = String.valueOf(c.charAt(i));
            golem[i] = 1;
        }
        for(int j = 0; j < b * 2 ; j++){
            spell[j] = sc.next();
        }         
        
        for(int k = 0; k < spell.length ; k=k+2){
            for(int l = 0; l < strArray.length ; l++){
                if(spell[k].equals(strArray[l])){
                    if(spell[k].equals(strArray[0]) && spell[k+1].equals("L")){
                        golem[0] = 0;
                    }
                    else if(spell[k].equals(strArray[a-1]) && spell[k+1].equals("R")){
                        golem[a-1] = 0;
                    }
                    else if(spell[k+1].equals("R") && golem[l] > 0){
                        golem[l] = golem[l] - 1;
                        golem[l+1] = golem[l] + 1;
                    }
                    else if(spell[k+1].equals("L") && golem[l] > 0){
                        golem[l] = golem[l] - 1;
                        golem[l-1] = golem[l] + 1;
                    }
                }
            }
        }
        for(int cnt = 0; cnt < golem.length ; cnt++){
            ans = ans + golem[cnt];
        }
        System.out.println(ans);
        
    }
}