import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.io.PrintWriter;

class Point{
    int x, y, index;
}

class Node{
    Point point;
    Node l, r;
    void print() {
    	System.out.println("x = " + point.x + ", y = " + point.y + ", index = " + point.index);
    }
    void printR() {
	this.print();
	if (this.l != null) { l.printR(); }
	if (this.r != null) { r.printR(); }
    }
}

class Tree{
    Node root;
    void printTree() {
	root.printR();
    }
}

class Answer{
    int[] index = new int[100];
    int numAns;
    void reset(){
	numAns = 0;
	for(int i = 0; i < index.length; i++){
	    index[i] = -1;
	}
    }
    void print(PrintWriter pWriter){
	for(int i = 0; i < numAns; i++){
	    pWriter.println(index[i]);
	}
	pWriter.println();
    }
}


public class Main {
    static Point[] points;
    static Tree tree;
    static int n, q;
    static int[] sx, tx, sy, ty;
    static Answer answer;
    static PrintWriter pWriter;

    public static void main(String[] args){
	getInput();                        //??\??????????????????
	tree = new Tree();                 //tree?????????
	tree.root = make2DTree(0, n, 0);   //??¨????????????????????????
	//tree.printTree();

	pWriter = new PrintWriter(System.out);  
	
	answer = new Answer();
	for(int i = 0; i < q; i++){
	    answer.reset();
	    find(tree.root, sx[i], tx[i], sy[i], ty[i], 0);
	    Arrays.sort(answer.index, 0, answer.numAns);
	    answer.print(pWriter);
	}
	pWriter.flush();
	//tree.printTree();
    }

    static class XComparator implements Comparator<Point> {
	public int compare(Point point1, Point point2) {
	    return point1.x - point2.x;
	}
    }
    static class YComparator implements Comparator<Point> {
	public int compare(Point point1, Point point2) {
	    return point1.y - point2.y;
	}
    }

    static Node make2DTree(int l, int r, int depth){
	if(!(l < r)){return null;}
    
	int mid = (l + r) / 2;

	if(depth % 2 == 0){
	    //points?????????l??????r-1?????§??? x ???????????????????????´?????????
	    Arrays.sort(points, l, r, new XComparator());
	}else{
	    //points?????????l??????r-1?????§??? y ???????????????????????´?????????
	    Arrays.sort(points, l, r, new YComparator());
	}

	Node node = new Node();  //??????????????????
	node.point = points[mid];
	node.l = make2DTree(l, mid, depth + 1);      //??????????????????????????£????????????
	node.r = make2DTree(mid+1, r, depth + 1);    //??????????????????????????£????????????
	return node;
    }

    
    static void find(Node node, int sx, int tx, int sy, int ty, int depth){
	if(node == null){return;}
	if((sx <= node.point.x) && (node.point.x <= tx) &&
	   (sy <= node.point.y) && (node.point.y <= ty)){
	    answer.index[answer.numAns] = node.point.index;
	    answer.numAns++;
	    // System.out.println(node.point.index);

	}

	if(depth % 2 == 0){ 
	    if(sx <= node.point.x){
		find(node.l, sx, tx, sy, ty, depth + 1);
	    }
	    if(node.point.x <= tx){
		find(node.r, sx, tx, sy, ty, depth + 1);
	    }
	}else{
	    if(sy <= node.point.y){
		find(node.l, sx, tx, sy, ty, depth + 1);
	    }
	    if(node.point.y <= ty){
		find(node.r, sx, tx, sy, ty, depth + 1);
	    } 
	}
	
    }
    

    static void getInput(){
	Scanner scanner = new Scanner (System.in);
	n = scanner.nextInt();
	points = new Point[n];

	for(int i = 0; i < n; i++){
	    Point point = new Point();
	    point.index = i;
	    point.x = scanner.nextInt();
	    point.y = scanner.nextInt();
	    points[i] = point;
	}

	q = scanner.nextInt();
	sx = new int[q];
	tx = new int[q];
	sy = new int[q];
	ty = new int[q];

	for(int i = 0; i < q; i++){
	    sx[i] = scanner.nextInt();
	    tx[i] = scanner.nextInt(); 
	    sy[i] = scanner.nextInt();
	    ty[i] = scanner.nextInt(); 
	}

    }

}