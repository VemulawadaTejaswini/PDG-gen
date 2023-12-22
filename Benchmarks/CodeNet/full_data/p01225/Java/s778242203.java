import java.util.*;

public class Main {
    public static void main(String[] args){
        // Your code here!
        
        Scanner sc = new Scanner(System.in);
        int set = sc.nextInt();
        int number[] = new int[9];
        int Rnumber[] = new int[9];
        int Gnumber[] = new int[9];
        int Bnumber[] = new int[9];
        int setcount = 0;
        
        for(int i = 0 ; i < set ; i++){
            setcount = 0;
            
            for(int t = 0 ; t < 9 ; t++){
                number[t] = sc.nextInt();
            }
            for(int c = 0 ; c < 9 ; c++){
                String color = sc.next();
                if(color.equals("R")){
                    Rnumber[c] = number[c];
                }
                else if(color.equals("G")){
                    Gnumber[c] = number[c];
                }
                else if(color.equals("B")){
                    Bnumber[c] = number[c];
                }
            }
            
            Arrays.sort(Rnumber);
            Arrays.sort(Gnumber);
            Arrays.sort(Bnumber);
            
            setcount += search(Rnumber);
            setcount += search(Gnumber);
            setcount += search(Bnumber);

/*            
            for(int time = 0 ; time < 9 ; time++){ //Rの数字を検索
                if(Rnumber[time] == 0){   //  数字がなかった場合
                    continue;
                }
                
                else{ //数字が1以上だった場合
                    for(int time2 = 1 ; time2 < 9-time ; time2++){
                        if(Rnumber[time+time2] == Rnumber[time]+1 || Rnumber[time] == Rnumber[time+time2]){ //数字が同じか、数字+1があった時
                        
                            for(int time3 = 1 ; time3 < 9-time-time2 ; time3++){
                                if(Rnumber[time+time2+time3] == Rnumber[time]+2 || Rnumber[time] == Rnumber[time+time2+time3]){
                                    setcount++;
                                    Rnumber[time] = 0;
                                    Rnumber[time+time2] = 0;
                                    Rnumber[time+time2+time3] = 0;
                                    break;
                                }
                            }
                            
                            
                        }
                        
                    }
                    
                }
            }
            
            for(int time = 0 ; time < 9 ; time++){ //Gの数字を検索
                if(Gnumber[time] == 0){   //  数字がなかった場合
                    continue;
                }
                
                else{ //数字が1以上だった場合
                    for(int time2 = 1 ; time2 < 9-time ; time2++){
                        if(Gnumber[time+time2] == Gnumber[time]+1 || Gnumber[time] == Gnumber[time+time2]){ //数字が同じか、数字+1があった時
                        
                            for(int time3 = 1 ; time3 < 9-time-time2 ; time3++){
                                if(Gnumber[time+time2+time3] == Gnumber[time]+2 || Gnumber[time] == Gnumber[time+time2+time3]){
                                    setcount++;
                                    Gnumber[time] = 0;
                                    Gnumber[time+time2] = 0;
                                    Gnumber[time+time2+time3] = 0;
                                    break;
                                }
                            }
                            
                            
                        }
                        
                    }
                    
                }
            }
            
            for(int time = 0 ; time < 9 ; time++){ //Bの数字を検索
                if(Bnumber[time] == 0){   //  数字がなかった場合
                    continue;
                }
                
                else{ //数字が1以上だった場合
                    for(int time2 = 1 ; time2 < 9-time ; time2++){
                        if(Bnumber[time+time2] == Bnumber[time]+1 || Bnumber[time] == Bnumber[time+time2]){ //数字が同じか、数字+1があった時
                        
                            for(int time3 = 1 ; time3 < 9-time-time2 ; time3++){
                                if(Bnumber[time+time2+time3] == Bnumber[time]+2 || Bnumber[time] == Bnumber[time+time2+time3]){
                                    setcount++;
                                    Bnumber[time] = 0;
                                    Bnumber[time+time2] = 0;
                                    Bnumber[time+time2+time3] = 0;
                                    break;
                                }
                            }
                            
                            
                        }
                        
                    }
                    
                }
            }*/
            
            //System.out.println(setcount);
            if(setcount == 3){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
            
        }
        
    }
    
    private static int search (int nums[]){
        int setcount = 0;
        for(int time = 0 ; time < 9 ; time++){ //Rの数字を検索
                if(nums[time] == 0){   //  数字がなかった場合
                    continue;
                }
                
                else{ //数字が1以上だった場合
                    for(int time2 = 1 ; time2 < 9-time ; time2++){
                        if(nums[time+time2] == nums[time]+1){ //数字が同じか、数字+1があった時
                        
                            for(int time3 = 1 ; time3 < 9-time-time2 ; time3++){
                                if(nums[time+time2+time3] == nums[time]+2){
                                    setcount++;
                                    nums[time] = 0;
                                    nums[time+time2] = 0;
                                    nums[time+time2+time3] = 0;
                                    break;
                                }
                            }
                            break;
                        }
                        
                        else if(nums[time] == nums[time+time2]){
                            
                            for(int time3 = 1 ; time3 < 9-time-time2 ; time3++){
                                if(nums[time] == nums[time+time2+time3]){
                                    setcount++;
                                    nums[time] = 0;
                                    nums[time+time2] = 0;
                                    nums[time+time2+time3] = 0;
                                    break;
                                }
                            }
                            
                        }
                        
                    }
                    
                }
            }
            return setcount;
    }
    
}
