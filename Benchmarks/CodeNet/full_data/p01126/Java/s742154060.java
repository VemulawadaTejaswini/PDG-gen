import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException{
		// インプットデータ取得
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n_tatesen = Integer.parseInt(br.readLine());
        int m_yokosen = Integer.parseInt(br.readLine());
        int a_selected = Integer.parseInt(br.readLine());



        while(true) {
        if(n_tatesen!=0&&m_yokosen!=0&&a_selected!=0) {
        	break;}
        }

        int height, p_tatesen, q_tatesen;
        int[][] map = new int[m_yokosen][2*m_yokosen];
        for(int i=0;i<m_yokosen;i++) {
        	//横線がわたる高さと縦線番号を取得
        	height=Integer.parseInt(br.readLine());
        	p_tatesen=Integer.parseInt(br.readLine());
        	q_tatesen=Integer.parseInt(br.readLine());
        	//高さが決まるとき、小さい側の縦線が3番だったら
        	//3から4か4から3のどちらかになるが、それは自分の現在地次第
        	map[height][p_tatesen]=q_tatesen;
        	map[height][q_tatesen]=p_tatesen;
        }

        //現在地がaなので、3番にいるときの行先がmapの値に入っている
        //高い順でループを回す
        for(int i=2*m_yokosen;i<0;i--) {
        	if(map[i][a_selected]!=0) {
        		a_selected=map[i][a_selected];
        	}
        }

	}

	 public static void ScanYokosen(){
		 //横線のデータを取得する

	 }

	 public static void SelectYokosen(){
		 //選んだ縦線から必要な線だけ抜き出して、高さ順に並べる
	 }

}

