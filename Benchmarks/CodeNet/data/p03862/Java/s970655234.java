class UnionFind {
	private int[] data;
	
	public UnionFind(int size) {
		data = new int[size];
		clear();
	}
	
	public UnionFind(final UnionFind uf) {
		data = uf.data.clone();
	}
	
	public void copyFrom(final UnionFind uf) {
		System.arraycopy(uf.data, 0, data, 0, data.length);
	}
	
	public void clear() {
		Arrays.fill(data, -1);
	}
	
	public int root(int x) { return data[x] < 0 ? x : (data[x] = root(data[x])); }
	
	public void union(int x, int y) {
		if((x = root(x)) != (y = root(y))) {
			if(data[y] < data[x]) { final int t = x; x = y; y = t; }
			data[x] += data[y];
			data[y] = x;
		}
	}
	
	public boolean same(int x, int y) { return root(x) == root(y); }
	public int size(int x) { return -data[root(x)]; }
}
