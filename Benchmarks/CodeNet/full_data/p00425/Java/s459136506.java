import java.io.*;

class Main{
    public static void main(String[] a)throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String str = null;        
        int orderNum;
        int sum = 1;
        
        // 各指示の移動パターン(数字はサンプルの初期位置の目に対応)
        int[] defaultDice = {1,2,3,4,5,6};
        int[] north = {5,1,3,4,6,2}; 
        int[] east  = {3,2,6,1,5,4}; 
        int[] west  = {4,2,1,6,5,3};
        int[] south = {2,6,3,4,1,5}; 
        int[] Left  = {1,3,5,2,4,6};
        int[] Right = {1,4,2,5,3,6};

        int[] beforeDice = new int[6];
        int[] afterDice = new int[6];
        
        beforeDice = defaultDice.clone();
        while((str = in.readLine()) != null){
            if(str.equals("0")){
                // 0：処理終了
                System.exit(0);
            }else{
                // 命令回数の読み込み
                orderNum = Integer.parseInt(str);
                // 初期化
                beforeDice = defaultDice.clone();
                sum = beforeDice[0];      
                
                for(int i=0; i<orderNum; i++){
                    str = in.readLine();
                    
                    switch(str){
                        case "North":
                            for(int j=0; j<6; j++){
                                afterDice[north[j] - 1] = beforeDice[j];
                            }
                            break;
                        case "East":
                            for(int j=0; j<6; j++){
                                afterDice[east[j] - 1] = beforeDice[j];
                            }
                            break;
                        case "West":
                            for(int j=0; j<6; j++){
                                afterDice[west[j] - 1] = beforeDice[j];
                            }
                            break;
                        case "South":
                            for(int j=0; j<6; j++){
                                afterDice[south[j] -1] = beforeDice[j];
                            }
                            break;
                        case "Left":
                            for(int j=0; j<6; j++){
                                afterDice[Left[j] -1] = beforeDice[j];
                            }
                            break;
                        case "Right":
                            for(int j=0; j<6; j++){
                                afterDice[Right[j] -1] = beforeDice[j];
                            }
                            break;
                            
                        default:
                           System.out.println("Input Error");
                    }
                    beforeDice = afterDice.clone();
                    sum += afterDice[0];
                }
                System.out.println(sum);
          
            }
        }
    }
}