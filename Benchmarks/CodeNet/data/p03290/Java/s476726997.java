import java.util.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int Num = scanner.nextInt();
        int targetNum = scanner.nextInt();
        
        ArrayList<Integer> questionNum = new ArrayList<>();
        
        
        int[] bornus = new int[Num];
        int[] q_num = new int[Num];
        scanner.nextLine();
        int questionSum = 0;
        
        for(int i=1;i<=Num;i++){
            q_num[i-1] = scanner.nextInt();
            questionSum += q_num[i-1];
            
            for(int j=0;j<questionSum;j++){
                questionNum.add(i*100);
            }
            
            bornus[i-1] = scanner.nextInt();
            
        }
        ArrayList<Integer> questionstr = new ArrayList<>(questionNum);
       
        int result = 0;
        int resultCnt = 0;
        int resultstr = 1000;
        int str2 = 0;
        for(int i=0;i<Math.pow(2,questionSum);i++){
            resultCnt = 0;
            result = 0;
            str2=0;
           
            for(int j=0;j<questionSum;j++){
                
                if((i & (1<<j)) != 0){
                    //System.out.println("j:"+j);
                    result += questionNum.get(j);
                    //System.out.println(result+"+="+ questionNum.get(j));
                    questionNum.set(j,0);
                    resultCnt++;
                }
            }
            result += calculator(questionNum,q_num,bornus);
            
           
            
            
            //System.out.println("result:"+result);
            
            if(result >= targetNum){
               // System.out.println("result:"+result);
                //System.out.println("Count"+resultstr);
                if(resultstr>resultCnt)resultstr=resultCnt;
            }
            
            
        }
        
        System.out.print(resultstr);
        
        
        
       
        
    }
    
    static int calculator(ArrayList<Integer> questions,int[] qNum,int[] bornus){
        int count = 0;
        int sum = 0;
        int str = 0;
        for(int i=0;i<qNum.length;i++){
           count=0;
           for(int j=str;j<str+qNum[i];j++){
               if(questions.get(j)==0){
                   count++;
                   questions.set(j,(i+1)*100);
               }
           }
           
           str += qNum[i];
            
            if(count==qNum[i])sum += bornus[i];
        }
        
        return sum;
        
    }
    
    
        
        
}