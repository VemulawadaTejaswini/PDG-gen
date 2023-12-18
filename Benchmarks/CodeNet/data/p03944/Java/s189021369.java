import java.util.*;

class Main {
public static void main(String[] args){

Scanner sc = new Scanner(System.in);
int W = sc.nextInt();
int H = sc. nextInt();
int box[][] = new int[W][H];
for(int i = 0;i < W;i++){
for(int j = 0;j < H;j++){
box[i][j] = 0;
}
}

int N = sc.nextInt();
int px;
int py;
int a;
for(int k = 0;k < N;k++){
px = sc.nextInt()-1;
py = sc.nextInt()-1;
a = sc.nextInt();
if(a == 1){
for(int aa = 0;aa <= px ;aa++){
for(int bb = 0;bb < H;bb++){
box[aa][bb] = 1;
}
}
}else if(a == 2){
for(int cc = px+1;cc < W;cc++){
for(int dd =0;dd < H;dd++){
box[cc][dd] = 1;
}
}
}else if(a == 3){
for(int ee = 0;ee <= W;ee++){
for(int ff = 0;ff < py;ff++){
box[ee][ff] = 1;
}
}
}else{
for(int gg = 0;gg < W;gg++){
for(int hh = py+1;hh < H;hh++){
box[gg][hh] = 1;
}
}
}

}

int total = 0;
for(int l = 0;l < W;l++){
for(int m = 0;m < H;m++){
if(box[l][m] == 0){
total += 1;
}
}
}

System.out.println(total);

}
}