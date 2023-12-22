import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Y
 */

class saikoro{
    String a[];
    String tmp;
    saikoro(String a){
        this.a = new String[6];
        this.a = a.split(" ");
    }
    
    void N(){
        tmp = this.a[0];
        this.a[0] = this.a[1]; this.a[1] = this.a[5]; 
        this.a[5] = this.a[4]; this.a[4] = tmp; 
    }
    void S(){
        tmp = this.a[0];
        this.a[0] = this.a[4]; this.a[4] = this.a[5]; 
        this.a[5] = this.a[1]; this.a[1] = tmp; 
    }
    void W(){
        tmp = this.a[0];
        this.a[0] = this.a[2]; this.a[2] = this.a[5];
        this.a[5] = this.a[3];  this.a[3] = tmp;
    }
    void E(){
        tmp = this.a[0];
        this.a[0] = this.a[3];  this.a[3] = this.a[5];
        this.a[5] = a[2];  this.a[2] = tmp;
    }
    public String getS(int n){
        return this.a[n];
    }
}

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        saikoro d = new saikoro(str);
        str = br.readLine();
        
        for(int i = 0;i<str.length();i++){
            char c = str.charAt(i);
            switch(c){
                case 'N':
                    d.N();
                    break;
                case'S':
                    d.S();
                    break;
                case 'W':
                    d.W();
                    break;
                case 'E':
                    d.E();
                    break;
                default:
                    break;
            }
        }
        
        System.out.println(d.getS(0));
    }
}