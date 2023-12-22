import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static final Integer MAX_VALUE = Integer.valueOf(10000000);
	private static final int BASE_SIZE = 2000;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int nSize = in.nextInt();
		int qSize = in.nextInt();
		ArrayList<LinkedList<Integer>> all = new ArrayList<LinkedList<Integer>>();
		List<Integer> layerMin = new ArrayList<Integer>();
		{
			for (int n = 0; n < nSize; n++) {
				int layerIndex = n / BASE_SIZE;
				if (n % BASE_SIZE == 0) {
					layerMin.add(MAX_VALUE);
					all.add(new LinkedList<Integer>());
				}
				Integer val = Integer.valueOf(in.nextInt());
				all.get(layerIndex).add(val);
				if (layerMin.get(layerIndex).compareTo(val) > 0) {
					layerMin.set(layerIndex, val);
				}
			}
			//			testPrint(all, layerMin);
		}
		for (int q = 0; q < qSize; q++) {
			int queryNum = in.nextInt();
			int q1 = in.nextInt();
			int q2 = in.nextInt();
			//			System.out.println(queryNum + ":" + q1 + ":" + q2);
			{
				int layerIndexR = q2 / BASE_SIZE;
				int posiInLayerR = q2 % BASE_SIZE;
				int layerIndexL = q1 / BASE_SIZE;
				int posiInLayerL = q1 % BASE_SIZE;
				if (queryNum == 0) {
					Integer move = all.get(layerIndexR).remove(posiInLayerR);
					Integer removeInt = move;
					for (int i = layerIndexR; i > layerIndexL; i--) {
						Integer addInt = all.get(i - 1).removeLast();
						resetMin(all, layerMin, i, removeInt, addInt);
						all.get(i).addFirst(addInt);
						removeInt = addInt;
					}
					resetMin(all, layerMin, layerIndexL, removeInt, move);
					all.get(layerIndexL).add(posiInLayerL, move);
				} else if (queryNum == 1) {
					Integer min = MAX_VALUE;
					if (layerIndexL != layerIndexR) {
						List<Integer> list = new ArrayList<Integer>();
						//	subList = all.get(layerIndexL).subList(posiInLayerL, all.get(layerIndexL).size());
						list.addAll(all.get(layerIndexL));
						List<Integer> subList = list.subList(posiInLayerL, all.get(layerIndexL).size());
						for (Integer v : subList) {
							min = min(min, v);
						}
						list.clear();
						list.addAll(all.get(layerIndexR));
						subList = list.subList(0, posiInLayerR + 1);
						for (Integer v : subList) {
							min = min(min, v);
						}
						subList = layerMin.subList(layerIndexL + 1, layerIndexR);
						for (Integer v : subList) {
							min = min(min, v);
						}
					} else {
						List<Integer> ll = new ArrayList<Integer>(all.get(layerIndexL));
						List<Integer> list = ll.subList(posiInLayerL, posiInLayerR + 1);
						for (Integer v : list) {
							min = min(min, v);
						}
					}
					System.out.println(min);
				}
			}
			if (queryNum == 2) {
				int layerIndex = q1 / BASE_SIZE;
				int posiInLayer = q1 % BASE_SIZE;
				Integer val = Integer.valueOf(q2);
				Integer removeInt = all.get(layerIndex).set(posiInLayer, val);
				resetMin(all, layerMin, layerIndex, removeInt, val);

			}

			//			testPrint(all, layerMin);
		}

	}

	private static Integer min(Integer o1, Integer o2) {
		if (o1.compareTo(o2) > 0) {
			return o2;
		}
		return o1;
	}

	private static void resetMin(ArrayList<LinkedList<Integer>> all, List<Integer> layerMin, int layerIndex,
			Integer removeInt, Integer addInt) {
		Integer min = layerMin.get(layerIndex);
		if (addInt.compareTo(min) < 0) {
			layerMin.set(layerIndex, addInt);
		} else if (removeInt.compareTo(min) == 0) {
			min = addInt;
			for (Integer v : all.get(layerIndex)) {
				min = min(min, v);
			}
			layerMin.set(layerIndex, min);
		}
	}

	private static void testPrint(ArrayList<LinkedList<Integer>> all, List<Integer> layerMin) {
		System.out.println("------------");
		int i = 0;
		for (List<Integer> list : all) {
			System.out.println(list + "(" + layerMin.get(i++) + ")");
		}
		System.out.println("------------");
	}
}