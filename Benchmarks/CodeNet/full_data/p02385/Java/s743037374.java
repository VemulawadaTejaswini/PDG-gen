import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Y
 */
//ITP1_11???DICE2
class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();  //?????????????????? ??????????????????
        String str2 = br.readLine();  //?????????????????? ??????????????????
        
        saikoro d1 = new saikoro(str1);
        saikoro d2 = new saikoro(str2);
        if(d1.equals(d2)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
    
    
}
    

    

class saikoro{
    String a[]; //???????????????????????¨???
    String b[]; //??????????????????????????¨???
    String tmp;
    
    
    
    saikoro(String a){
        this.a = new String[6];
        this.a = a.split(" ");   //java p486?????§
        this.b = new String[6];
        this.b[0]="1"; this.b[1]="2"; this.b[2]="3"; 
        this.b[3]="4"; this.b[4]="5"; this.b[5]="6";
    }
    
    void N(){
        tmp = this.a[0];
        this.a[0] = this.a[1]; this.a[1] = this.a[5]; 
        this.a[5] = this.a[4]; this.a[4] = tmp; 
        tmp = this.b[0];
        this.b[0] = this.b[1]; this.b[1] = this.b[5]; 
        this.b[5] = this.b[4]; this.b[4] = tmp; 
    }
    void S(){
        tmp = this.a[0];
        this.a[0] = this.a[4]; this.a[4] = this.a[5]; 
        this.a[5] = this.a[1]; this.a[1] = tmp; 
        tmp = this.b[0];
        this.b[0] = this.b[4]; this.b[4] = this.b[5]; 
        this.b[5] = this.b[1]; this.b[1] = tmp; 
    }
    void W(){
        tmp = this.a[0];
        this.a[0] = this.a[2]; this.a[2] = this.a[5];
        this.a[5] = this.a[3];  this.a[3] = tmp;
        tmp = this.b[0];
        this.b[0] = this.b[2]; this.b[2] = this.b[5];
        this.b[5] = this.b[3];  this.b[3] = tmp;
    }
    void E(){
        tmp = this.a[0];
        this.a[0] = this.a[3];  this.a[3] = this.a[5];
        this.a[5] = this.a[2];  this.a[2] = tmp;
        tmp = this.b[0];
        this.b[0] = this.b[3];  this.b[3] = this.b[5];
        this.b[5] = this.b[2];  this.b[2] = tmp;
    }
    
    //?????´?????????????????¢
    void SideMove(){
        tmp = this.a[1];
        this.a[1] = this.a[2];  this.a[2] = this.a[4];
        this.a[4] = this.a[3];  this.a[3] = tmp;
        tmp = this.b[1];
        this.b[1] = this.b[2];  this.b[2] = this.b[4];
        this.b[4] = this.b[3];  this.b[3] = tmp;
    }
    
    public String getS(int n){
        return this.a[n];
    }
    
    public String getBottom(int n){
        switch(n){
            case 0: 
                return a[5]; 
            case 1: 
                return a[4];
            case 2: 
                return a[3];
            case 3:
                return a[2]; 
            case 4:
                return a[1]; 
            case 5:
                return a[0];
            default: 
                return null;
            
        }
         
    }
    
    
}